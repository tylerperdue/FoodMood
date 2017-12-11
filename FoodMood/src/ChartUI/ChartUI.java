/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChartUI;

import ChartController.ChartController;
import ChartModel.Chart;
import FoodModel.FoodCache;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.Dataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author jro5165
 */
public class ChartUI extends JPanel{
    
   private ChartController chartCtrl;
   private XYSeries series;
   private JButton typeAmountButton;
   private JButton typeVsMoodButton;
   private ChartPanel chartPanel1;
   private ChartPanel chartPanel2;
   private BorderLayout bl;
   //private JButton 
    
    /**
     * Class constructor. Initializes components on the JPanel.
     */
    public ChartUI(ChartController chartCtrl){
        System.out.println("ChartPanel Instantiated.");
        this.chartCtrl = chartCtrl;
        initComponents();
    }

    /** 
     * Initiate components method for the class.
     */
    public void initComponents(){
        bl = new BorderLayout();
        
        typeAmountButton = new JButton("Food Type Amounts");
        typeAmountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeAmountButtonActionPerformed(evt);
            }
        });
        
        typeVsMoodButton = new JButton("Mood to Food Type");
        typeVsMoodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeVsMoodButtonActionPerformed(evt);
            }
        });
        
        //CHART 1 INITIATE //
        CategoryDataset dataset1 = createTypeAmountDataset(); //Dataset for bar chart.
        JFreeChart typeAmountChart = createChart(dataset1); //Creates chart with created dataset.
        chartPanel1 = new ChartPanel(typeAmountChart); //Creates the panel to hold the chart.
        chartPanel1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        chartPanel1.setPreferredSize(new Dimension(515,300));
        chartPanel1.setBackground(Color.white);
        chartPanel1.setLayout(bl);
        add(chartPanel1, bl.PAGE_START);
        add(typeAmountButton,bl.PAGE_END);
        add(typeVsMoodButton,bl.PAGE_END);

       // END //
       
       //CHART 2 INITIATE//
       CategoryDataset dataset2 = createTypeVsMoodDataset();
       JFreeChart typeVsMoodChart = createChart2(dataset2);
       chartPanel2 = new ChartPanel(typeVsMoodChart);
       chartPanel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
       chartPanel2.setPreferredSize(new Dimension(515,300));
       chartPanel2.setBackground(Color.white);
       chartPanel2.setLayout(bl);
       
    }
    
    //Action Listener to switch to bar chart
    private void typeAmountButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        System.out.println("pressed");
        this.remove(chartPanel2);
        this.remove(typeVsMoodButton);
        this.remove(typeAmountButton);
        this.add(chartPanel1, bl.PAGE_START);
        this.add(typeAmountButton, bl.PAGE_END);
        this.add(typeVsMoodButton, bl.PAGE_END);
        repaint();
        revalidate();
    } 
    
    
    //Action listener to switch to scatter chart.
    private void typeVsMoodButtonActionPerformed(java.awt.event.ActionEvent evt) { 
        System.out.println("pressed");
        this.remove(chartPanel1);
        this.remove(typeVsMoodButton);
        this.remove(typeAmountButton);
        this.add(chartPanel2, bl.PAGE_START);
        this.add(typeAmountButton, bl.PAGE_END);
        this.add(typeVsMoodButton, bl.PAGE_END);

        repaint();
        revalidate();
    
    } 
    
    private CategoryDataset createTypeAmountDataset() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(FoodCache.getNumOfFoodType("Fruit"), "Fruit", "Fruit");
        dataset.setValue(FoodCache.getNumOfFoodType("Vegetable"), "Veggie", "Vegetable");
        dataset.setValue(FoodCache.getNumOfFoodType("Grain"), "Grain", "Grain");
        dataset.setValue(FoodCache.getNumOfFoodType("Junk Food"), "Junk Food", "Junkfood");
        dataset.setValue(FoodCache.getNumOfFoodType("Meat"), "Meat", "Meat");
        dataset.setValue(FoodCache.getNumOfFoodType("Other"), "Other", "Other");

        return dataset;
    }
    
    private CategoryDataset createTypeVsMoodDataset() {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();    
    dataset.setValue(FoodCache.getNumOfFoodType("Fruit"), "Fruit", "Fruit");

    return dataset;
  }
    
    
    
   private JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart chart = ChartFactory.createBarChart(
                "Food Type to Mood Correlation", 
                "Food Type", 
                "Times Consumed)", 
                dataset, 
                PlotOrientation.VERTICAL,
                true, 
                true, 
                false 
        );


      
        return chart;

    }

    private JFreeChart createChart2(CategoryDataset dataset) {

        JFreeChart chart = ChartFactory.createLineChart(
                "Mood vs Food Type",
                "Food Type",
                "Mood",
                dataset);

        
      
        return chart;

    }

}


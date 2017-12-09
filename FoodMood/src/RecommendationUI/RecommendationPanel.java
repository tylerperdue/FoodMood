/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecommendationUI;

import RecommendationController.RecommendationController;

/**
 *
 * @author tylerperdue
 */
public class RecommendationPanel extends javax.swing.JPanel {

    private RecommendationController recommendationCtrl;
    
    /**
     * Creates new form RecommendationPanel
     */
    public RecommendationPanel(RecommendationController recommendationCtrl) {
        this.recommendationCtrl = recommendationCtrl;
        initComponents();
        String paragraph = "Does food affect how you feel?\n" +
"You know that if you eat a sweet snack, such as a candy bar or a sugary donut, you'll get a spike of energy, soon followed by a crashing low. Sugar highs and lows are just one of the many ways food can affect how you feel.\n" +
"\n" +
"But have you ever considered which eating habits and specific foods might help you to feel happier and more energized? Recent research helps illuminate the role food plays in influencing your mood.\n" +
"\n" +
"STRATEGIES\n" +
"Nutrition strategies for mood maintenance\n" +
"There's more to mood maintenance than eating the right foods. The framework for good mood hygiene begins with implementing some basic nutrition strategies:\n" +
"\n" +
"Eat often enough\n" +
"\n" +
"According to research published by the University of Illinois Extension, eating regular meals and snacks at the same times every day helps keep your blood sugar levels steady. Eating at regular intervals helps to ensure that your body has a continuous source of fuel, and this may assist in keeping your mood stable. If you feel like your blood sugar might be dipping frequently, talk to your doctor. This could be a sign of hypoglycemia. Hypoglycemia is a health condition that causes people to need to eat frequently.\n" +
"\n" +
"Don’t skip meals\n" +
"\n" +
"Though it may be tempting to rush out the door without breakfast, the Mayo Clinic says that this is a bad idea. Skipping meals actually makes your body less able to assimilate food, and you are more liable to overeat at the next meal. If you keep yourself from getting too hungry, you may be able to avoid a bad mood.\n" +
"\n" +
"Know what to avoid\n" +
"\n" +
"Before you can eat mood-boosting foods, it's important to know which foods to leave off, or limit, on your shopping list. The biggest bad mood culprits are refined carbohydrates, such as sugar. The simple sugars that are in junk foods, such as candy and soda, as well as in everyday foods, such as fruit juice, syrup, and jams, can cause your blood sugar to go up and down like a rollercoaster. Refined white starches such as white rice, white bread, and crackers can have the same effect. The Cleveland Clinic warns that junk foods may satisfy your taste buds, but they probably won’t help your mood.\n" +
"\n" +
"Blood sugar spikes and drops can leave you with a short-lived burst of energy followed by a tired, cranky feeling. For best mood results, you should also limit alcohol, since it's a depressant and can disturb your sleep.\n" +
"\n" +
"MOOD FOODS\n" +
"Foods that will boost your mood\n" +
"Here are some of the best foods to eat to stay healthy and happy:\n" +
"\n" +
"Protein\n" +
"\n" +
"Adding protein to your meals can help slow the absorption of carbohydrates in your blood and increase the release of dopamine and norepinephrine, which may improve your mood and energy for several hours after eating. Try adding these smart protein choices to your diet:\n" +
"\n" +
"eggs\n" +
"poultry\n" +
"seafood\n" +
"tofu\n" +
"low-fat Greek yogurt\n" +
"Vitamins\n" +
"\n" +
"There are a few specific vitamins that may be helpful for mood. For example, vitamin D may help relieve mood disorders, such as seasonal affective disorder. Sunlight, before sunscreen application, is often the best source. To get your daily dose of vitamin D, you can also try the following foods. Many doctors recommend adding a multivitamin that contains vitamin D as well.\n" +
"\n" +
"low-fat milk\n" +
"egg yolks\n" +
"soymilk\n" +
"The vitamins folate and B-12 may help ease depression. To add folate to your diet, try these foods:\n" +
"\n" +
"broccoli\n" +
"lentils\n" +
"oatmeal\n" +
"oranges\n" +
"dark leafy greens\n" +
"Vitamin B-12 can be found in:\n" +
"\n" +
"cottage cheese\n" +
"lean beef\n" +
"salmon\n" +
"Fiber\n" +
"\n" +
"Foods, like complex carbohydrates, that contain soluble fiber can slow the absorption of sugar into your bloodstream and increase serotonin, the “feel good” chemical, both of which decrease mood swings. You can find healthy amounts of fiber in:\n" +
"\n" +
"oats\n" +
"beans\n" +
"pears\n" +
"peas\n" +
"Brussels sprouts\n" +
"TAKEAWAY\n" +
"Putting it all together\n" +
"There's a clear relationship between food and your state of mind. When you combine strategies for eating regularly with foods that may have a positive effect on your well-being, you can plan meals that may help you to feel better. You can also avoid foods that may make you feel worse. Now that's something to be happy about!";
        jLabel2.setText("<html><p style=\"width:200px\">"+paragraph+"</p></html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("Food Mood Recommendations:");

        jLabel2.setText("oes food affect how you feel? You know that if you eat a sweet snack, such as a candy bar or a sugary donut, you'll get a spike of energy, soon followed by a crashing low. Sugar highs and lows are just one of the many ways food can affect how you feel.  But have you ever considered which eating habits and specific foods might help you to feel happier and more energized? Recent research helps illuminate the role food plays in influencing your mood.  STRATEGIES Nutrition strategies for mood maintenance There's more to mood maintenance than eating the right foods. The framework for good mood hygiene begins with implementing some basic nutrition strategies:  Eat often enough  According to research published by the University of Illinois Extension, eating regular meals and snacks at the same times every day helps keep your blood sugar levels steady. Eating at regular intervals helps to ensure that your body has a continuous source of fuel, and this may assist in keeping your mood stable. If you feel like your blood sugar might be dipping frequently, talk to your doctor. This could be a sign of hypoglycemia. Hypoglycemia is a health condition that causes people to need to eat frequently.  Don’t skip meals  Though it may be tempting to rush out the door without breakfast, the Mayo Clinic says that this is a bad idea. Skipping meals actually makes your body less able to assimilate food, and you are more liable to overeat at the next meal. If you keep yourself from getting too hungry, you may be able to avoid a bad mood.  Know what to avoid  Before you can eat mood-boosting foods, it's important to know which foods to leave off, or limit, on your shopping list. The biggest bad mood culprits are refined carbohydrates, such as sugar. The simple sugars that are in junk foods, such as candy and soda, as well as in everyday foods, such as fruit juice, syrup, and jams, can cause your blood sugar to go up and down like a rollercoaster. Refined white starches such as white rice, white bread, and crackers can have the same effect. The Cleveland Clinic warns that junk foods may satisfy your taste buds, but they probably won’t help your mood.  Blood sugar spikes and drops can leave you with a short-lived burst of energy followed by a tired, cranky feeling. For best mood results, you should also limit alcohol, since it's a depressant and can disturb your sleep.  MOOD FOODS Foods that will boost your mood Here are some of the best foods to eat to stay healthy and happy:  Protein  Adding protein to your meals can help slow the absorption of carbohydrates in your blood and increase the release of dopamine and norepinephrine, which may improve your mood and energy for several hours after eating. Try adding these smart protein choices to your diet:  eggs poultry seafood tofu low-fat Greek yogurt Vitamins  There are a few specific vitamins that may be helpful for mood. For example, vitamin D may help relieve mood disorders, such as seasonal affective disorder. Sunlight, before sunscreen application, is often the best source. To get your daily dose of vitamin D, you can also try the following foods. Many doctors recommend adding a multivitamin that contains vitamin D as well.  low-fat milk egg yolks soymilk The vitamins folate and B-12 may help ease depression. To add folate to your diet, try these foods:  broccoli lentils oatmeal oranges dark leafy greens Vitamin B-12 can be found in:  cottage cheese lean beef salmon Fiber  Foods, like complex carbohydrates, that contain soluble fiber can slow the absorption of sugar into your bloodstream and increase serotonin, the “feel good” chemical, both of which decrease mood swings. You can find healthy amounts of fiber in:  oats beans pears peas Brussels sprouts TAKEAWAY Putting it all together There's a clear relationship between food and your state of mind. When you combine strategies for eating regularly with foods that may have a positive effect on your well-being, you can plan meals that may help you to feel better. You can also avoid foods that may make you feel worse. Now that's something to be happy about!");
        jScrollPane1.setViewportView(jLabel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(139, 139, 139))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

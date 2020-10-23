public class DemoSugarSmash {
    public static void main(String[] args) {
        System.out.println("Sugar Smash Player");
        SugarSmashPlayer sugar_smash=new SugarSmashPlayer();
        sugar_smash.setScore(100, 1);
        sugar_smash.setScore(20, 2);
        System.out.println("Score of level 1:"+sugar_smash.getScore(1));
        System.out.println("Score of level 2:"+ sugar_smash.getScore(2));

        System.out.println("Premium Sugar Smash Player");
        PremiumSugarSmashPlayer premium=new PremiumSugarSmashPlayer();
        premium.setScore(20, 1);
        premium.setPaid(2);
        premium.setPaid(3);
        premium.setScore(100, 1);
        premium.setScore(30, 3);
        premium.setScore(100, 2);
        premium.setScore(35, 3);
        System.out.println("Score of leve 1:"+premium.getScore(1));
        System.out.println("Score of level 2:"+premium.getScore(2));
        System.out.println("Score of level 3:"+ premium.getScore(3));

    }

}

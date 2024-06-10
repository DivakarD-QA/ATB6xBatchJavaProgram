package May_2024.May182024.AccessModifier.police;

public class JrCop {
    public static void main(String[] args) {
        cop c1 = new cop(10);
        System.out.println(c1.gun);
        c1.canIShoot();
        //c1.GiveMeGun();
        c1.GiveMeBullets();
    }
}

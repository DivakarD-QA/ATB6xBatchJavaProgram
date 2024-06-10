package May_2024.May182024.AccessModifier.police;

public class cop {

     public int gun;
    String IdCard;

     public cop(int gun) {
        this.gun = gun;
    }

    public void canIShoot(){
        System.out.println("Off-Course, Shoot!");

    }


     private void GiveMeGun() {
        System.out.println("Take the GUN");
    }

    protected  void GiveMeBullets(){
        System.out.println("Give me more Bullets");
    }
}

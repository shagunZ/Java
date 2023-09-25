import java.util.*;

class Players{
     private String name;
    private int roll; 
    void setPlayersDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        this.name = sc.nextLine();
        System.out.println("enter roll:");
        this.roll = sc.nextInt();

    }
    void getPlayersDetails(){
        System.out.println(this.name+" : "+ this.roll);
    }
}

class Team{
    private String name = " ";
    private int sizeofTeam;
Players[] pt;
    public void setTeamDetail() {
        System.out.println("enter name and size of Team");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        this.sizeofTeam = sc.nextInt();
       this.pt = new Players[this.sizeofTeam];

        for(int i=0;i<this.sizeofTeam;i++){
            pt[i] = new Players();
            pt[i].setPlayersDetails();
        }
    }

    public void getTeamDetail() {
        System.out.println("Team: "+this.name);
       for(int i=0;i<this.sizeofTeam;i++){
            this.pt[i].getPlayersDetails();
        }
    }
}
class Tournament{
    private String name = " ";
    private int numtour;
Team [] t;
    public void setTourDetail() {
        System.out.println("enter name and num of Tour");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        this.numtour = sc.nextInt();
       t = new Team[this.numtour];

        for(int i=0;i<this.numtour;i++){
            t[i] = new Team();
            t[i].setTeamDetail();
        }
    }

    public void getTourDetail() {
        System.out.println("Tour: "+this.name);
       for(int i=0;i<this.numtour;i++){
            t[i].getTeamDetail();
        }
    }
}

public class TestTournament {
 private String name = " ";
    private int numtest;
Tournament [] test;

     public void setTestDetail() {
        System.out.println("enter name and num of Test");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        this.numtest = sc.nextInt();
       test = new Tournament[this.numtest];

        for(int i=0;i<this.numtest;i++){
            test[i] = new Tournament();
            test[i].setTourDetail();
        }
    }

    public void getTestDetail() {
        System.out.println("Test: "+this.name);
       for(int i=0;i<this.numtest;i++){
            test[i].getTourDetail();
        }
    }

    public static void main(String[] args) {
        TestTournament Demo = new TestTournament();
        Demo.setTestDetail();
        Demo.getTestDetail();
    }
}

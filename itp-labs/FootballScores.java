import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        String matchresults = "Barca 1 Sevilla 0, RealMadrid 1 Barca 1, Barca 3 Valencia 1, Villareal 2 Barca 1, Espanyol 2 Barca 4";
        
        int played = 0; int wins = 0; int draw = 0; int loss = 0; int homegames = 0; int points = 0; int awaygames = 0; int goals = 0; int conceded = 0;
        int a = 0; int b = 0;

        System.out.println("Team: ");
        String team = sc.next();

        String[] arr = matchresults.split(", ");

        String[] eachgame;

        for (int i = 0; i < arr.length; i++) {
           
            eachgame = arr[i].split(" "); 
            
            if (team.equals(eachgame[0])) {
                 a = Integer.parseInt(eachgame[1]);
                 b = Integer.parseInt(eachgame[3]);
                homegames++;
                System.out.println(a);
                System.out.println(b);
            } else  if (team.equals(eachgame[2])) {
                 a = Integer.parseInt(eachgame[3]);
                 b = Integer.parseInt(eachgame[1]);
                awaygames++;
            } else {
                continue;
            }
            played++;

            if (a > b) {
                wins++;
            } else if (a == b) {
                draw++;
            } else {
                loss++;
            }
            goals += a;
            conceded += b;
        }

        points += (wins * 3) + draw;

        System.out.println("Stats of " + team);
        System.out.println("//");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loss);
        System.out.println("Draws: " + draw);
        System.out.println("Goals Scored: " + goals);
        System.out.println("Goals Conceded: " + conceded);
        System.out.println("Home Games: " + homegames);
        System.out.println("Away Games: " + awaygames);
        System.out.println("Points: " + points);
        System.out.println("Total Games Played: " +  played);
    }
}


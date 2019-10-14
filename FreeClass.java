package Other;
import java.util.Scanner;
import java.util.Random;

public class FreeClass {
/*
        int a = rnd.nextInt(6)+1;
        int b;
        int c;

        do{
           b = rnd.nextInt(6)+1;

        }while(a == b);

        do{
            c = rnd.nextInt(6)+1;

        }while(b == c || a == c);


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int a = rnd.nextInt(26)+65;
        int b = rnd.nextInt(26)+97; //97 122
        int c = rnd.nextInt(10)+48; //48 57
        int d = rnd.nextInt(101)+100; //100 200
        int e = rnd.nextInt(21)+(-10); //-10 +10
        int f = rnd.nextInt(4)+(-1); //-1 +2
        int g = rnd.nextInt(503)+113; //113 615
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);


        int r = 2*(rnd.nextInt(45)+5); //dvojciferne párne číslo 10 98
        int s = 2*(rnd.nextInt(45)+5)+1; //dvojciferne nepárne číslo


        System.out.println(r);
        System.out.println(s);
        */
/*

        Scanner month = new Scanner(System.in);
        System.out.println("Month");
        int m = month.nextInt();

        switch (m) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Wrong month number");
        int r = 2*(rnd.nextInt(45)+5); //dvojciferne delitelne 11
        int s = 2*(rnd.nextInt(45)+5)+1; //dvojciferne nepárne číslo
        }

        int r = 11 * (rnd.nextInt(81) + 10); //trojciferne delitelne 11  1000 9999
        System.out.println(r);


        int prime;
        int div;
        do {
            prime = rnd.nextInt(4500)+500;
            prime = 2*prime+1;
            div=0;
            for(int i=2;i<=Math.sqrt(prime);i++){
                if(prime%i==0){
                    div++;
                }
            }

        }while(div>0);

        System.out.println(prime);
6znakov

        String password = "";

        for (int i = 0; i < 5; i++) {
            int num = rnd.nextInt(26) + 97;
            char letter = (char) num;
            password = password + letter;
        }

        for (int i = 0; i < 5; i++) {
            int num = rnd.nextInt(26) + 65;
            char letter = (char) num;
            password = password + letter;
        }


        for (int i = 0; i < 5; i++) {
            int num = rnd.nextInt(10) + 48;
            char letter = (char) num;
            password = password + letter;
        }
        System.out.println(password);
    }



        String password = "";

        int one = rnd.nextInt(26) + 97;
        int two = rnd.nextInt(26) + 65;
        int three = rnd.nextInt(10) + 48;
        char letter1 = (char)one;
        char letter2 = (char)two;
        char letter3 = (char)three;

        password = password + letter1 + letter2 + letter3;

        for (int i = 0; i < 7; i++) {

            one = rnd.nextInt(26) + 97;
            two = rnd.nextInt(26) + 65;
            three = rnd.nextInt(10) + 48;

            if(rnd.nextInt(15)<=5){
                letter1 = (char) one;
                password = password + letter1;
            }else if (rnd.nextInt(15)<=10){
                letter2 = (char) two;
                password = password + letter2;
            }else {
                letter3 = (char) three;
                password = password + letter3;

            }


        }



//

        System.out.println(password);


    public String generatePassword(int n){
            if(n<6 || n>30){  // kontrola dlzky hesla
                n = 10;
            }
            String passwd="";
            int count=0;
            int digits=0;
            int upper=0;
            int lower=0;
            int num=0;
            Random rnd=new Random();
            do{
                int type=rnd.nextInt(3);
                switch(type){
                    case 0: num=rnd.nextInt(10)+'0'; digits++; break;
                    case 1: num=rnd.nextInt(26)+'A'; upper++; break;
                    case 2: num=rnd.nextInt(26)+'a'; lower++; break;
                }
                char c=(char)num;
                passwd+=c;
                count++;
                if(count==n && (digits==0 || upper==0 || lower==0)){
                    count=digits=upper=lower=0;
                    passwd="";
                }

            } while(count<n);

            return passwd;
        }*/


    public static void ten() {
        Random rnd = new Random();


        String password = "";

        int one = rnd.nextInt(26) + 97;
        int two = rnd.nextInt(26) + 65;
        int three = rnd.nextInt(10) + 48;
        char letter1 = (char) one;
        char letter2 = (char) two;
        char letter3 = (char) three;

        password = password + letter1 + letter2 + letter3;

        for (int i = 0; i < 7; i++) {

            one = rnd.nextInt(26) + 97;
            two = rnd.nextInt(26) + 65;
            three = rnd.nextInt(10) + 48;

            if (rnd.nextInt(15) <= 5) {
                letter1 = (char) one;
                password = password + letter1;
            } else if (rnd.nextInt(15) <= 10) {
                letter2 = (char) two;
                password = password + letter2;
            } else {
                letter3 = (char) three;
                password = password + letter3;

            }


        }

        System.out.println(password);


    }


    public void first() {

        Scanner day1 = new Scanner(System.in);
        System.out.println("Enter day");
        int day = day1.nextInt();

        Scanner month1 = new Scanner(System.in);
        System.out.println("Enter month");
        int month = month1.nextInt();

        if ((day <= 31) && (month <= 12)) {

            if (((day >= 21) && (month == 3)) || (day <= 20) && (month == 4)) {
                System.out.println("Baran/Aries");
            }
            if (((day >= 21) && (month == 4)) || (day <= 21) && (month == 5)) {
                System.out.println("Býk/Taurus");
            }
            if (((day >= 22) && (month == 5)) || (day <= 21) && (month == 6)) {
                System.out.println("Blíženci/Gemini");
            }
            if (((day >= 22) && (month == 6)) || (day <= 22) && (month == 7)) {
                System.out.println("Rak/Cancer");
            }
            if (((day >= 23) && (month == 7)) || (day <= 23) && (month == 8)) {
                System.out.println("Lev/Leo");
            }
            if (((day >= 24) && (month == 8)) || (day <= 23) && (month == 9)) {
                System.out.println("Panna/Virgo");
            }
            if (((day >= 24) && (month == 9)) || (day <= 23) && (month == 10)) {
                System.out.println("Váhy/Libra");
            }
            if (((day >= 24) && (month == 10)) || (day <= 22) && (month == 11)) {
                System.out.println("Škorpión/Scorpio");
            }
            if (((day >= 23) && (month == 11)) || (day <= 21) && (month == 12)) {
                System.out.println("Strelec/Sagittarius");
            }
            if (((day >= 22) && (month == 12)) || (day <= 20) && (month == 1)) {
                System.out.println("Kozorožec/Capricorn");
            }
            if (((day >= 21) && (month == 1)) || (day <= 19) && (month == 2)) {
                System.out.println("Vodnár/Aquarius");
            }
            if (((day >= 20) && (month == 2)) || (day <= 20) && (month == 3)) {
                System.out.println("Ryby/Pisces");
            }
        } else {
            System.out.println("Wrong number of day or month!");
        }
        int[][] zodiac = {
                {1900, 1912, 1924, 1936, 1948, 1960, 1972, 1984, 1996, 2008},
                {1901, 1913, 1925, 1937, 1949, 1961, 1973, 1985, 1997, 2009},
                {1926, 1938, 1950, 1962, 1974, 1986, 1998, 2010, 2010, 2010},
                {1927, 1939, 1951, 1963, 1975, 1987, 1999, 2011, 2011, 2011},
                {1916, 1928, 1940, 1952, 1964, 1976, 1988, 2000, 2012, 2012},
                {1917, 1929, 1941, 1953, 1965, 1977, 1989, 2001, 2013, 2013},
                {1918, 1930, 1942, 1954, 1966, 1978, 1990, 2002, 2014, 2014},
                {1919, 1931, 1943, 1955, 1967, 1979, 1991, 2003, 2015, 2015},
                {1920, 1932, 1944, 1956, 1968, 1980, 1992, 2004, 2016, 2016},
                {1921, 1933, 1945, 1957, 1969, 1981, 1993, 2005, 2017, 2017},
                {1922, 1934, 1946, 1958, 1970, 1982, 1994, 2006, 2018, 2018},
                {1923, 1935, 1947, 1959, 1971, 1983, 1995, 2007, 2019, 2019}
        };

        Scanner year1 = new Scanner(System.in);
        System.out.println("Enter year for chinesse zodiac");

        int year = year1.nextInt();
        int r;

        if ((year >= 1900) && (year <= 2019)) {

            for (r = 0; r <= 9; r++) {
                if (year == zodiac[0][r]) {
                    System.out.println("Potkan/Rat");
                }
                if (year == zodiac[1][r]) {
                    System.out.println("Byvol/Ox");
                }
                if (year == zodiac[2][r]) {
                    System.out.println("Tiger/Tiger");
                }
                if (year == zodiac[3][r]) {
                    System.out.println("Zajac/Rabbit");
                }
                if (year == zodiac[4][r]) {
                    System.out.println("Drak/Dragon");
                }
                if (year == zodiac[5][r]) {
                    System.out.println("Had/Snake");
                }
                if (year == zodiac[6][r]) {
                    System.out.println("Kôň/Horse");
                }
                if (year == zodiac[7][r]) {
                    System.out.println("Koza/Goat");
                }
                if (year == zodiac[8][r]) {
                    System.out.println("Opica/Monkey");
                }
                if (year == zodiac[9][r]) {
                    System.out.println("Kohút/Rooster");
                }
                if (year == zodiac[10][r]) {
                    System.out.println("Pes/Dog");
                }
                if (year == zodiac[11][r]) {
                    System.out.println("Prasa/Pig");
                }


            }

        } else {
            System.out.println("Wrong number of year!");
        }


    }

    public void second() {
        Random rnd = new Random();

        int correct=0;
        int bad=0;
        int number=1;

        System.out.println("Please enter your name:");
        Scanner d2 = new Scanner(System.in);
        String name = d2.nextLine();

        System.out.println("<<<<<<<");
        System.out.println("Hi "+name+"! Test is ready for you");
        System.out.println("<<<<<<<");


        for (int i = 1; i <=10; i++){
            int a = rnd.nextInt(90) + 10;
            int b = rnd.nextInt(90) + 10;
            System.out.println(number+". Exercise");
            System.out.println("------");
            int type = rnd.nextInt(4);
            switch (type) {
                case 0:
                case 1:
                    System.out.println(a + "+" + b);
                    break;
                case 2:
                    System.out.println(a + "*" + b);
                    break;
                case 3:
                    System.out.println(a + "-" + b);
                    break;
            }

            System.out.println("Your answer is:");
            Scanner c1 = new Scanner(System.in);
            int c = c1.nextInt();

            if ( ((type == 0) || (type == 1)) && (a + b == c)) {
                System.out.println("Good");
                System.out.println(" ");
                correct++;
            } else if ((type == 2) && (a * b == c)) {
                System.out.println("Good");
                System.out.println(" ");
                correct++;
            } else if ((type == 3) && (a - b == c)) {
                System.out.println("Good");
                System.out.println(" ");
                correct++;
            } else {
                System.out.println("Bad");
                System.out.println(" ");
                bad++;

            }
            number++;

        }

        System.out.println("Correct: "+correct+"/10");
        System.out.println("Bad: "+bad+"/10");
        System.out.println("Percent: "+correct*10+"%");







    }





}







/*

        System.out.println("--------------10--------------");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("First number");
        int n = myObj.nextInt();  // Read user input


        Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Second number");
        int n1 = myObj1.nextInt();  // Read user input


        for(int rows=1; rows<=n; rows++){
            for(int spaces=1;spaces<=n1;spaces++){
                if(rows==1 || rows==n || spaces==1 || spaces==n1){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");

        }

        System.out.println(" ");


        for(int rows=1; rows<=n; rows++){
            for(int spaces=1;spaces<=n1;spaces++){

                System.out.print("#");


            }
            System.out.println(" ");

        }

        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Char");
        String e = myObj2.nextLine();  // Read user input

        for(int rows=1; rows<=n; rows++){
            for(int spaces=1;spaces<=n1;spaces++){
                if(rows==1 || rows==n || spaces==1 || spaces==n1){
                    System.out.print(e);
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");

        }


    }


}


    public void ten() {
        System.out.println("--------------10--------------");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("First number");
        int n = myObj.nextInt();  // Read user input


        Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Second number");
        int n1 = myObj1.nextInt();  // Read user input


        for(int rows=1; rows<=n; rows++){
            for(int spaces=1;spaces<=n1;spaces++){
                if(rows==1 || rows==n || spaces==1 || spaces==n1){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");

        }

        System.out.println(" ");


        for(int rows=1; rows<=n; rows++){
            for(int spaces=1;spaces<=n1;spaces++){

                System.out.print("#");


            }
            System.out.println(" ");

        }

        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Char");
        String e = myObj2.nextLine();  // Read user input

        for(int rows=1; rows<=n; rows++){
            for(int spaces=1;spaces<=n1;spaces++){
                if(rows==1 || rows==n || spaces==1 || spaces==n1){
                    System.out.print(e);
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");

        }
        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Month");
        int e = myObj2.nextInt();  // Read user input

        if ((e <= 12) && (1 <= e)) {
                if(e==1){
                    System.out.print("January");
                }
                if(e==2){
                    System.out.print("February");
                }
                if(e==3){
                    System.out.print("March");
                }
                if(e==4){
                    System.out.print("April");
                }
                if(e==5){
                    System.out.print("May");
                }
                if(e==6){
                    System.out.print("June");
                }
                if(e==7){
                    System.out.print("July");
                }
                if(e==8){
                    System.out.print("August");
                }
                if(e==9){
                    System.out.print("September");
                }
                if(e==10){
                    System.out.print("October");
                }
                if(e==11){
                    System.out.print("November");
                }
                if(e==12){
                    System.out.print("December");
                }

        } else {
            System.out.print("Zlý mesiac");
        }
        switch (e) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Wrong number");
        }


        switch (e) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;


            default:
                System.out.println("Wrong number");
        }

        Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Month");
        int d = myObj3.nextInt();  // Read user input

        switch (d) {
            case 1:
                System.out.println("Winter");
                break;

            default:
                System.out.println("Wrong number");
        }

        System.out.println("Hi! I am java program and I am able to find roots of a quadratic equation");
        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter number one");
        double a = myObj2.nextDouble();  // Read user input


        Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter number two");
        double b = myObj3.nextDouble();  // Read user input


        Scanner myObj4 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter number three");
        double c = myObj4.nextDouble();  // Read user input

        double root1;
        double root2;
        double d = b * b - 4 * a * c;

        //   a1 b-10 c16 = prvný koren 2 a druhy koren 8
        // a1 b10 c25 = -5
        // a1 b4 c7 = 0

        if (a != 0) {

            if (d > 0) {
                System.out.println(d);
                root1 = (-b + Math.sqrt(d)) / (2*a);
                root2 = (-b - Math.sqrt(d)) / (2*a);
                System.out.println("Root 1 is:"+root1);
                System.out.println("Root 2 is:"+root2);
            } else if (d == 0) {
                System.out.println(d);
                root1 = (-b) / (2*a);
                System.out.println("Root is:"+root1);
            } else {
                System.out.println("Not possible");
            }

        } else {
            System.out.println("Wrong number");
        }


    }


    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("First number");
    int n = myObj.nextInt();  // Read user input

        for(int i=n;i>=1;i--){
        for(int j=n;j>=i;j--){
            System.out.print("  ");
            }

        for(int k=1;k<=(2*i-1);k++){

        System.out.print("* ");
         }
            System.out.println(" ");
        }




    }
    */
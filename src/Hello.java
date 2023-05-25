class Calculator {
    public int add(int number, int num) {
        int r = number + num;
        return r;
    }
}

class Computer {
    public void playMusic() {
        System.out.println("Music Playing..");
    }

    public String getMeAPen(int cost) {
        if(cost >= 10)
            return "Pen";
        return "Nothing";
    }
}  

class Calculator2 {
    public int add (int sum, int fun, int bun){
        return sum + fun + bun;
    }
}

// overloading
class Calculator3 {
    public int add (int sum, int fun, int bun){
        return sum + fun + bun;
    }
    public int add (int sum, int fun) {
        return sum + fun;
    }
    public double add (double sum, int fun) {
        return sum + fun;
    }

}

class Calculator4 {
    int jar = 5;
    public int add(int sum, int fun) {
        System.out.println(jar);
        return sum + fun;
    }
}

public class Hello {
    public static void main(String a[]) {
        // How to print - types = numbers, characters, variables

        // Numbers called int on line - 19
        System.out.println(7);

        // Characters on line - 19
        System.out.println("This is an sentence of characters to print in Java");

        // Variables
        int numVar = 3;
        System.out.println(numVar);

        // we can create result
        int crrt1 = 5;
        int crrt2 = 7;
        int result = crrt1 + crrt2;
        System.out.print(result);

        // We can also write var + var in print
        int numVar1 = 3;
        int numVar2 = 5;
        System.out.println(numVar1 + numVar2);

        // There are different - primitives = integer int on line - 5 and byte on 25, float on line - 21, character on line - 8, booleon - true or false and on line - 29

        // Float
        float float1  = 6.5f;
        System.out.println(float1);

        // Byte
        byte byte1 = 123;
        System.out.println(byte1);

        // Boolean
        int bool1 = 9;
        byte bool2 = 127;
        short bool3 = 558;
        long bool4 = 5854l;
        float bool5 = 5.8f;
        double bool6 = 5.8;
        char bool7 = 'k'; // char can also be a number // literals
        boolean bool8 = true;
        System.out.print(bool1 + bool2 + bool3 + bool4 + bool5 + bool6 + bool7);
        System.out.println(" " + bool8);

        // creating some booleans
        int x = 6;
        int zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz = 5;
        boolean result11 = x > zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz;
        System.out.println(result11);

        // in booleans to check they are same
        int xyz = 6;
        int y = 6;
        boolean result189 = xyz <= y;
        System.out.println(result189);

        // in booleans to check they are not same
        int yy = 6;
        int z = 6;
        boolean result13 = z != yy;
        System.out.println(result13);

        // in booleans to check they are correct same
        int yyyyyy = 6;
        int zzz = 6;
        boolean result10 = zzz == yyyyyy;
        System.out.println(result10);        

        // literals
        
        int lit1 = 0b101;
        System.out.println(lit1);

        // literals with hexadecimal
        int lit2 = 0x7e;
        System.out.println(lit2);

        // problems with 00zz 

        // int prblm = 10_00_00_000; // It does not shoes the "_" in output

        // to write a long number
        double lgnbr = 12e10;
        System.out.println(lgnbr);

        // to increament a value
        char iav = 'a';
        iav++;
        System.out.println(iav);

        // to decreament a value
        char dav = 'a';
        dav--;
        System.out.println(dav);

        // to increament a value in other way
        int iavow = 7;
        /* iavow = iavow + 2; or iavow += 2;*/
        System.out.println(iavow);
        // We can do other activities with this such as -, * and /

        // to decreament a value in other way
        int dave = 7;
        dave -= 2;
        System.out.println(dave);

        // the ultimate other way to increament
        int uowi = 7;
        int result0 = uowi++ ;
        System.out.println(result0);

        // the ultimate other way to increament
        int uowd = 7;
        int result00 = uowd--;
        System.out.println(result00);

        // to do addition
        int ad1 = 7;
        int ad2 = 5;
        int result1 = ad1 + ad2;
        System.out.println(result1);

        // to do subtraction
        int sb1 = 7;
        int sb2 = 5;
        int result2 = sb1 - sb2;
        System.out.println(result2);

        // to do multiplication
        int mp1 = 7;
        int mp2 = 5;
        int result3 = mp1 - mp2;
        System.out.println(result3);

        // to do division
        int dv1 = 7;
        int dv2 = 5;
        int result4 = dv1 / dv2;
        System.out.println(result4);

        // to get the reminder in the division
        int rd1 = 7;
        int rd2 = 5;
        int result5 = rd1 % rd2;
        System.out.println(result5);

        // if else statement 
        int xxxxxxxxxxxxxxxxxxxxx = 28;
        if(xxxxxxxxxxxxxxxxxxxxx > 10 && xxxxxxxxxxxxxxxxxxxxx <= 20) { /* 11-20 you can write true or false to exicute*/
            System.out.println("Hello");
        }
        else {
            System.out.println("Bye");
        }
        // if two elements
        int xxxx = 5;
        int yyyy = 7;
        if(xxxx > yyyy)
            System.out.println(xxxx);
        else
            System.out.println(yyyy);

        // if xxx = 8 then
        int xx = 8;
        int yyy = 7;
        if(xx > yy)
            System.out.println(xx);
        else
            System.out.println(yyy);

        // Where multiple statement then put on the {}
        int xxxxx = 5;
        int yyyyy = 7;
        if(xxxxx > yyyyy) {
            System.out.println(xxxxx);
            System.out.println("hello");
        }
        else
            System.out.println(yyyyy);

        // if multiple primitives then put
        int xxxxxx = 8;
        int yyyyyyy = 7;
        int zzzzzzzzzzzzzzzzzzz = 9;
        if(xxxxxx > yyyyyyy && xxxxxx > zzzzzzzzzzzzzzzzzzz)
            System.out.println(xxxxxx);
        else
            System.out.println(yyyyyyy);

        // if double commitation in else then
        int xxxxxxxxxxxxxxxxxxxxxxxxx = 8;
        int yyyyyyyy = 7;
        int zzzzzzzzzzzzzzzzzzzz = 9;
        if(xxxxxxxxxxxxxxxxxxxxxxxxx > yyyyyyyy && xxxxxxxxxxxxxxxxxxxxxxxxx > zzzzzzzzzzzzzzzzzzzz)
            System.out.println(xxxxxxxxxxxxxxxxxxxxxxxxx);
        else if(yyyyyyyy > xxxxxxxxxxxxxxxxxxxxxxxxx && yyyyyyyy > zzzzzzzzzzzzzzzzzzzz)
            System.out.println(yyyyyyyy);
        else 
            System.out.println(zzzzzzzzzzzzzzzzzzz);

        // in checking what is required then
        int xxxxxxxxxxxxxxxxxxxxxxxxxx = 8;
        int yyyyyyyyy = 7;
        int zzzzzzzzzzzzzzzzzzzzzz = 9;
        if(xxxxxxxxxxxxxxxxxxxxxxxxxx > yyyyyyyyy && xxxxxxxxxxxxxxxxxxxxxxxxxx > zzzzzzzzzzzzzzzzzzzzzz)
            System.out.println(xxxxxxxxxxxxxxxxxxxxxxxxxx);
        else if(yyyyyyyyy > zzzzzzzzzzzzzzzzzzzzzz)
            System.out.println(yyyyyyyyy);
        else 
            System.out.println(zzzzzzzzzzzzzzzzzzz);

        // In doing this type for statement
        int n = 1;
        if(n == 1)
            System.out.println("Monday");
        else if(n == 2)
            System.out.println("Tuesday");
        else if(n == 3)
            System.out.println("Wednesday");
        else if(n == 4)
            System.out.println("Thursday");
        else if(n == 5)
            System.out.println("Friday");
        else if(n == 6)
            System.out.println("Saturday");
        else
            System.out.println("Sunday");
        
        // Turn that to switch statement like this
        int nn = 1;
        switch(nn){
            case 1:
               System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
        }

        // loops - while, do while, for loop// repeat this statement 4 times

        // while loop
        int i = 1;
        while(i <= 4) {
            System.out.println("Hi " + i);
            int j = 1;
            while(j <= 3) {
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye " + i);

        // do while loop
        int dw = 5;     
        do {
            System.out.println("Hi " + dw);
            dw++;
        } while (dw <= 4); // It will at least print that one time
        // for loop
        for (int fl = 1; fl <= 4; fl++) {
            System.out.println("Hi " + fl);
        }
        // ulta gugad
        for (int fl = 4; fl >= 1; fl--) {
            System.out.println("Hi " + fl);
        }
        // for doing some another things    
        for (int fl = 1; fl <= 4; fl++) {

            System.out.println("Day  " + fl);
            for(int jdk = 1; jdk <= 9; jdk++){
                System.out.println("    " + (jdk + 8) + " - " + (jdk + 9));
            }
        }
        // like calculator adding two numbers
        int num1 = 4;
        int num2 = 5;
        Calculator calc = new Calculator();
        int result1111 = calc.add(4, 5);
        // int result111 = num1 + num2;
        System.out.println(result1111);
        
        // Computer wala
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(12);
        System.out.println(str);

        // Calculator wala 2
        Calculator2 odj = new Calculator2();
        int sum1 = odj.add(3, 4, 5);
        System.out.println(sum1);

        // adding another public int in calc 3
        Calculator3 odjdj = new Calculator3();
        int sum2 = odjdj.add(3, 4);
        System.out.println(sum2);

        // adding another public int in calc 4
        int data = 10;
        Calculator4 odjmaro = new Calculator4();
        int sum3 = odjmaro.add(3, 4);
        System.out.println(sum3);

        // doing some chedchad in that
        // int data = 10;
        Calculator4 odjmario = new Calculator4();
        Calculator4 odjmaromaro = new Calculator4();
        // System.out.println(sum3);
        odjmario.jar= 8;
        System.out.println(odjmario.jar);
        System.out.println(odjmaromaro.jar);

        // array bhi sikh lo bhai
        int nums[] = {3, 7, 2, 4};
        System.out.println(nums[0]); // Aap yaha 0 se 3 tak kuch bhi lich satke he

        // to change the array number
        int numz[] = {3, 7, 2, 4};
        numz[1] = 6;
        System.out.println(numz[1]); // Aap yaha 0 se 3 tak kuch bhi lich satke he

        // to make it dynamic
        int numzz[] = new int[4];
        numzz[0] = 4;
        numzz[1] = 8;
        numzz[2] = 3;
        numzz[3] = 9;
        for(int my = 0; my < 4; my++) {
            System.out.println(numzz[my]);
        }

        // two dimensional array kya hota he
        int numy[][] = new int[3][4];
        for(int tie = 0; tie < 3; tie++) {
            for(int no = 0; no < 4; no++) {
                System.out.print(numy[tie][no] + " ");
            }
            System.out.println();
        }

        // to fetch random values
        int numies[][] = new int[3][4];
        for(int cut = 0; cut < 3; cut++) {
            for(int but = 0; but < 4; but++) {
                numies[cut][but] = (int)(Math.random() * 10);
            }
        }

        for(int note = 0; note < 3; note++) {
            for(int row = 0; row < 4; row++) {
                System.out.print(numies[note][row] + " ");
            }
            System.out.println();
        }

        for(int r[] : numies) {
            for(int m : r) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // jagged array error
        int burner[][] = new int[3][];
        burner[0] = new int[3];
        burner[1] = new int[4];
        burner[2] = new int[2];
        for(int nut = 0; nut < burner.length; nut++) {
            for(int shut = 0; shut < burner[nut].length; shut++) {
                burner[nut][shut] = (int)(Math.random() * 10);
            }
        }
        for(int bruh[] : burner) {
            for(int m : bruh) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // multi dimensional array kya hota he
        int turner[][][] = new int[3][4][4];
        for(int out = 0; out < turner.length; out++) {
            for(int xyzback = 0; xyzback < turner[out].length; xyzback++) {
                turner[out][xyzback][0] = (int)(Math.random() * 10);
            }
        }
        for(int[] togue : burner) {
            for(int m : togue) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
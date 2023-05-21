class Calculator {
    public int add(int n1,int n2) {
        int r = n1 + n2;
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
    public int add (int n1, int n2) {
        return n1 + n2;
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
        } while (i <= 4); // It will at least print that one time
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

        // Computer wala 2
        Calculator2 odj = new Calculator2();
        odj.add(num1, num2);
    }   
}
public class Main {
    public static void main(String[] args) {
//        pirma uzduotis
        int a = 8;
        int b = 19;
//      antra uzduotis
        suma(a, b);
//      ketvirta uzduotis
        int[] numbers = {1, 2, 3, 4, 5};
        skaiciai(numbers);
//      trecia uzduotis
        int nr1 = 5;
        int nr2 = 7;
        int rezultatas1 = padauginimas(nr1, nr2);
        System.out.println("Sandauga: " + rezultatas1);
//        penkta uzduotis
        System.out.println("5 uzduotis ");
        System.out.println(penkta(25, 37));
//    Sukurkite Funkciją kuri vadinasi PISq. Funkcija gražina double tipo reikšmę.
//    Reikšmė yra : 9.8596; Gautą reikšmę atspausdinkite.
        double rezultatas = PISq();
        System.out.println("Rezultatas: " + rezultatas);
//        sesta uzduotis
        System.out.println("sesta uzduotis");
        int[] arr = sestas(5, 10, 5);
        skaiciai(arr);
//        7 uzduotis

        int suma = Array2(arr);
        System.out.println("7 uzduoties suma " + suma);

//        8 uzduotis

        double vidurkis = vidurkis(arr);

        System.out.println("8 uzduoties vidurkis: " + vidurkis);

//        9 uzduotis

        System.out.println("9 uzduotis");
        rectangle(6, 4);

//        10 uzduotis

        String sakinys = "siandien labai grazi diena";
        skaiciavimas("siandien labai grazi diena");

//        ~11uzduotis

//        "siandien labai grazi diena".contains([ ])
        skaiciavimasB(sakinys);


    }


    public static void suma(int x, int y) {
        int suma2 = x + y;
        System.out.println("suma " + suma2);

    }


    public static double PISq() {
        return 9.8596;

    }


    public static void skaiciai(int[] eile) {
        for (int skaiciukai : eile) {
            System.out.print(skaiciukai + " ");
        }
        System.out.println();
    }

    public static int padauginimas(int num1, int num2) {
        return num1 * num2;

    }


    public static int penkta(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }
//     ~6 uzduotis

    public static int[] sestas(int min, int max, int ilgis) {
        int[] array = new int[ilgis];
        for (int i = 0; i < ilgis; i++) {
            array[i] = min - (int) Math.round(Math.random() * (max - min));
        }
        return array;
    }
//    ~~~7 uzduotiss

    public static int Array2(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        return suma;
    }

//    ~8 uzudotis

    public static double vidurkis(int[] arr) {
        int sum1 = Array2(arr);
        return (double) sum1 / arr.length;

//            9 uzduotis
    }

    public static void rectangle(int eiluciu, int stulpeliu) {
        for (int i = 0; i < eiluciu; i++) {
            for (int j = 0; j < stulpeliu; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

//    10 uzduotis


    public static void skaiciavimas(String sakinys) {
        int symbolsCount = 0;
        int spacesCount = 0;
        for (int i = 0; i < sakinys.length(); i++) {
            char simbolis = sakinys.charAt(i);
            if (simbolis != ' ') {
                symbolsCount++;
            } else {
                spacesCount++;
            }
        }
        System.out.println("10 uzduotis~~~ " + symbolsCount + " raides " + spacesCount + " tarpai");
    }

    public static void skaiciavimasB(String sakinys) {
        int spaces = (sakinys.replaceAll("[^ ]","").length());
        int symbols = (sakinys.length() -  spaces);

        System.out.println("10,5 uzduotis~~~~ " +"tarpu "+ spaces  + " raidziu " + symbols );



    }



















}





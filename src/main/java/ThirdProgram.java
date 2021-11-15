public class ThirdProgram {
    public static void main(String[] args) {
        System.out.println("Урок третий, задание третье. Решение квадратного уровнения !!!? \n" +
                "Вычисление факториала числа n!");

        System.out.println("Формула дискриминта D = 2b-4ac. В зависимости от знака «D» (дискриминанта)\n" +
                "квадратное уравнение может иметь два, один или ни одного корня. Рассмотрим все три случая.\n" +
                "....");

        System.out.println("Условие задания №1. Вычисление корней квадратного уравнения\n" +
                "\n" + "Условие: Метод принимает в качестве аргументов коэффициенты a, b, c \n" +
                "квадратного уравнения (a*x^+b*x-c=0).\n" +
                "\n" + "В теле метода требуется вывести на экран значения корней этого уравнения \n" +
                "согласно следующим правилам:\n" +
                "если первый коэффициент a равен нулю, то вывести \"Первый коэффициент не может быть 0\";\n" +
                "если уравнение не имеет корней, то вывести \"Нет действительных решений уравнения\";\n" +
                "если уравнение имеет два корня, то вывести их в строку через пробел (для одного корня, \n" +
                "достаточно одного значения). \n" +
                "Первый случай когда D>0 - есть два корня;\n" +
                "Второй случай когда D=0 - есть один корень; \n" +
                "Третий случай когда D<0 - корней нет.");

        double discrim = discrim(2,5,-7);
        System.out.println("Дискириминант уравнения с предложенныеми аргументами = " + discrim);
        if (discrim > 0) {
            System.out.println("В уравнении два корня x1 и x2, уравнение вычисляется !" + "Дискриминант = \n" +
                    (discrim));
        }
        else if (discrim == 0) {
            System.out.println("В уравнении один корень x1, уравнение вычисляется !" + "Дискриминант = \n" +
                    (discrim));
        } else if (discrim < 0) {
            System.out.println("Корней уравнения нет !" + "Дискриминант = \n" +
                    (discrim));
        }

        double kvadroUroKoren1 = kvadroUroKoren1(1,2,3, discrim);
        System.out.println("Решение уравнения с предложенныеми аргументами х1 = " + kvadroUroKoren1);

        double kvadroUroKoren2 = kvadroUroKoren2(1,2,3, discrim);
        System.out.println("Решение уравнения с предложенныеми аргументами х2 = " + kvadroUroKoren2);

        double factorial = factorial (3);
        if (factorial == 0) {
            System.out.println("Факториал 0!=1");
        } else if (factorial <= 1) {
            System.out.println("Факториал 1!=1");
        } else if (factorial >= 1) {
            System.out.println("Факториал =" + factorial);
        }
    }

    // метод вычисления дискриминанта
    public static double discrim (double arg1, double arg2, double arg3) {
        double resultD = Math.sqrt((arg2 * arg2) - (4 * arg1 * arg3));
        return resultD;
    }
    // вычисление корней уравнения по формуле x1,2 = -b +- Math.sqrt(D) / (2*a
    public static double kvadroUroKoren1 (double arg1, double arg2, double arg3, double discrim) {
        double resultUro1 = ((-arg2) + discrim)/(2 * arg1);
        return resultUro1;
    }
    public static double kvadroUroKoren2 (double arg1, double arg2, double arg3, double discrim) {
        double resultUro2 = ((-arg2) - (discrim))/(2 * arg1);
        return resultUro2;
    }

    // Вычисление факториала 2. Вычисление факториала числа n!,
    //Условие: где n - входной параметр метода (целое число),
    // в  качестве результата должно вернуться значение равное
    // 1*2*..*n, при этом 1!=1, 2!=2 и т.д.
    public static int factorial (int arg1) {
        int n = arg1 * (arg1 - 1);
        return n;
    }

}
// я так и не понял почему в результате x1 получилось 3,5 а не 1 ?!
// я так и не понял почему в результате x1 получилось -5,5 а не -3,0 ?!




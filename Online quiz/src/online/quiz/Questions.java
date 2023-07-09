package online.quiz;

public class Questions {
    String question[][] = new String[10][5];
    String answers[][] = new String[10][1];
    
    Questions(){
        String qq1 = "<html>"
                + "Which is used to find and fix bugs in JAVA" + "<br>" + "programs?"
                + "<html>";
        question[0][0] = qq1;
        question[0][1] = "JVM";
        question[0][2] = "JDB";
        question[0][3] = "JDK";
        question[0][4] = "JRE";

        String qq2 = "<html>"
                + "What is the return type of the hashCode() method in " + "<br>" + "the Object class?"
                + "<html>";
        question[1][0] = qq2;
        question[1][1] = "int";
        question[1][2] = "Object";
        question[1][3] = "long";
        question[1][4] = "void";

        question[2][0] = "Which package contains the Random class?";
        question[2][1] = "java.util package";
        question[2][2] = "java.lang package";
        question[2][3] = "java.awt package";
        question[2][4] = "java.io package";

        question[3][0] = "An interface with no fields or methods is known as?";
        question[3][1] = "Runnable Interface";
        question[3][2] = "Abstract Interface";
        question[3][3] = "Marker Interface";
        question[3][4] = "CharSequence Interface";

        String qq3 = "<html>"
                + "In which memory a String is stored, when we create " + "<br>" + "a string using new operator?"
                + "<html>";
        question[4][0] = qq3;
        question[4][1] = "Stack";
        question[4][2] = "String memory";
        question[4][3] = "Random storage space";
        question[4][4] = "Heap memory";

        question[5][0] = "Which of the following is a marker interface?";
        question[5][1] = "Runnable interface";
        question[5][2] = "Remote interface";
        question[5][3] = "Readable interface";
        question[5][4] = "Result interface";

        String qq4 = "<html>"
                + "Which keyword is used for accessing the features of " + "<br>" + "a package?"
                + "<html>";
        question[6][0] = qq4;
        question[6][1] = "import";
        question[6][2] = "package";
        question[6][3] = "extends";
        question[6][4] = "export";

        question[7][0] = "In java, jar stands for?";
        question[7][1] = "Java Archive Runner";
        question[7][2] = "Java Archive";
        question[7][3] = "Java Application Resource";
        question[7][4] = "Java Application Runner";

        question[8][0] = "Which of the following is a mutable class in java?";
        question[8][1] = "java.lang.StringBuilder";
        question[8][2] = "java.lang.Short";
        question[8][3] = "java.lang.Byte";
        question[8][4] = "java.lang.String";

        String qq5 = "<html>"
                + "Which of the following option leads to the " + "<br>" + "portability and security of Java?"
                + "<html>";
        question[9][0] = qq5;
        question[9][1] = "Bytecode is executed by JVM";
        question[9][2] = "The applet makes the Java code secure and portable";
        question[9][3] = "Use of exception handling";
        question[9][4] = "Dynamic binding between objects";

        answers[0][0] = "JDB";
        answers[1][0] = "int";
        answers[2][0] = "java.util package";
        answers[3][0] = "Marker Interface";
        answers[4][0] = "Heap memory";
        answers[5][0] = "Remote interface";
        answers[6][0] = "import";
        answers[7][0] = "Java Archive";
        answers[8][0] = "java.lang.StringBuilder";
        answers[9][0] = "Bytecode is executed by JVM";
    }
}

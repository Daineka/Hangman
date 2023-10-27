package main;

//Печать на экран виселицы
public class PrintGallow {
    public static void drawGallows(int count) {
        switch (count) {
            case 7:
                System.out.println(
                        """
                                |----
                                |   |
                                |
                                |
                                |
                                |""");
                break;
            case 6:
                System.out.println(
                        """
                                |----
                                |   |
                                |   ()
                                |
                                |
                                |""");
                break;
            case 5:
                System.out.println(
                        """
                                |----
                                |   |
                                |   ()
                                |   []
                                |
                                |""");
                break;
            case 4:
                System.out.println(
                        """
                                |----
                                |   |
                                |   ()
                                |  /[]
                                |
                                |""");
                break;
            case 3:
                System.out.println(
                        """
                                |----
                                |   |
                                |   ()
                                |  /[]\\
                                |
                                |""");
                break;
            case 2:
                System.out.println(
                        """
                                |----
                                |   |
                                |   ()
                                |  /[]\\
                                |   /
                                |""");
                break;
            case 1:
                System.out.println(
                        """
                                |----
                                |   |
                                |   ()
                                |  /[]\\
                                |   /\\
                                |""");
                break;
        }
    }
}

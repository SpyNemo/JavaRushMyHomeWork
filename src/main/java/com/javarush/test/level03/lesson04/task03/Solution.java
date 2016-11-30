package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg z01 = new Zerg ();
        z01.name = "Alos";
        Zerg z02 = new Zerg ();
        z02.name = "Alos";
        Zerg z03 = new Zerg ();
        z03.name = "Alos";
        Zerg z04 = new Zerg ();
        z04.name = "Alos";
        Zerg z05 = new Zerg ();
        z05.name = "Alos";
        Zerg z06 = new Zerg ();
        z06.name = "Alos";
        Zerg z07 = new Zerg ();
        z07.name = "Alos";
        Zerg z08 = new Zerg ();
        z08.name = "Alos";
        Zerg z09 = new Zerg ();
        z09.name = "Alos";
        Zerg z10 = new Zerg ();
        z10.name = "Alos";

        Protos p01 = new Protos ();
        p01.name = "Alos";
        Protos p02 = new Protos ();
        p02.name = "Alos";
        Protos p03 = new Protos ();
        p03.name = "Alos";
        Protos p04 = new Protos ();
        p04.name = "Alos";
        Protos p05 = new Protos ();
        p05.name = "Alos";

        Terran t01 = new Terran ();
        t01.name = "Alos";
        Terran t02 = new Terran ();
        t02.name = "Alos";
        Terran t03 = new Terran ();
        t03.name = "Alos";
        Terran t04 = new Terran ();
        t04.name = "Alos";
        Terran t05 = new Terran ();
        t05.name = "Alos";
        Terran t06 = new Terran ();
        t06.name = "Alos";
        Terran t07 = new Terran ();
        t07.name = "Alos";
        Terran t08 = new Terran ();
        t08.name = "Alos";
        Terran t09 = new Terran ();
        t09.name = "Alos";
        Terran t10 = new Terran ();
        t10.name = "Alos";
        Terran t11 = new Terran ();
        t11.name = "Alos";
        Terran t12 = new Terran ();
        t12.name = "Alos";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}
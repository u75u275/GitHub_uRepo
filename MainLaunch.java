package ua.org.oa.yuriyyurchenkoy.TASK6;

/**
 * ﻿Создать java класс, содержащий несколько методов демонстрирующих возникновение следующих исключений/ошибок:
 * a. ArrayIndexOutOfBoundsException
 * b. IllegalArgumentException
 * c. ClassCastException
 * d. StringIndexOutOfBoudException
 * e. NullPointerException (3 различных способа)
 * f. StackOverflowError
 * g. NumberFormatException
 * e. OutOfMemoryError
 * 1. На этапе составления программы должны быть использованы соглашения из java code convention.
 * 2. Протестировать предложенное решение, продемонстрировать корректность решения задачи каждым способом.
 * 3. Имя пакета в котором создается класс/классы должно иметь формат ua.org.oa.<Jira Login>.
 * 4. Индивидуальная папка в SVN репозатарии для сохранения выполненных
 * заданий расположена по адресу http://oracle-academy.org.ua/svn/<Имя проекта>/<Jira login>

 */
public class MainLaunch {
    public static void main(String[] args) {

        errorSpawn instanceES = new errorSpawn();

        instanceES.ArrayIndex(10);

        instanceES.IllegalArgument("27772ю121212");

        instanceES.ClassCastException();

        instanceES.StringIndexOutOfBoudException("StringIndex", 28);

        instanceES.NullPointer1();

        instanceES.NullPointer2();

        instanceES.NullPointer3();

        instanceES.StackOver();

        instanceES.NumberFormatException("9292929.111b");

        instanceES.OutOfMemoryError();
    }
}

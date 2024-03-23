package ru.yandex.practikum;

public class Praktikum {
    public static void main(String[] args) {
         /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        Account account1 = new Account("ТимотейШевроле");
        Account account2 = new Account("Тимоти Шаламе");
        System.out.println(account1.checkNameToEmboss());
        System.out.println(account2.checkNameToEmboss());
    }
}
package ru.yandex.practikum;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        boolean res = true;
        if (this.name.equals(" ")) {
            res = false;
        }
        if (!(this.name.length() >= 3 && this.name.length() <= 19)) {
            res = false;
        }
        if (!this.name.contains(" ")){
            res = false;
        }
        if (this.name.startsWith(" ") || this.name.endsWith(" ")) {
            res = false;
        }
        return res;
    }
}

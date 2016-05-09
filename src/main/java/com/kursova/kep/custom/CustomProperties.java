package com.kursova.kep.custom;

import com.kursova.kep.entity.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mr. Skip.
 */
public class CustomProperties {

    public static Class getClassFromHeaderButtons(String buttonName){
        Class aClass = null;
        switch (buttonName){
            case "Платники":
                aClass = Subscribers.class;
                break;
            case "Платежі":
                aClass = Payment.class;
                break;
        }
        return aClass;
    }

    public static List<VariablesForCell> getCellFormat(String originTableName){
        switch (originTableName){
            case "Subscribers":
                return cellFormatForSubscribers();
            case "Payment":
                return cellFormatForPayment();
            case "String": return null;
        }
        return null;
    }

    private static List<VariablesForCell> cellFormatForPayment() {
        List<VariablesForCell> forCells = new ArrayList<>();
        forCells.add(new VariablesForCell("id", "Номер", null));
        forCells.add(new VariablesForCell("dayOfPayment", "День платежу"));
        forCells.add(new VariablesForCell("lastPayment", "Останній платіж", "[A-Za-zА-Яа-яїЇіІєЄ0-9 .-]"));
        forCells.add(new VariablesForCell("currentMeter", "Країна"));
        forCells.add(new VariablesForCell("lastMeter", "Мобільний телефон", "[0-9() ]"));
        forCells.add(new VariablesForCell("limit", "Ім’я менеджера"));
        forCells.add(new VariablesForCell("reuseLimit", "Поштова скринька", "[A-Za-z@0-9.]"));
        forCells.add(new VariablesForCell("debt", "Веб-сайт", "[A-Za-z@0-9\\.]"));
        forCells.add(new VariablesForCell("amountForPayment", "Веб-сайт", "[A-Za-z@0-9\\.]"));
        forCells.add(new VariablesForCell("subscribers", "Веб-сайт", "[A-Za-z@0-9\\.]"));
        return forCells;
    }

    private static List<VariablesForCell> cellFormatForSubscribers() {
        List<VariablesForCell> forCells = new ArrayList<>();
        forCells.add(new VariablesForCell("id", "Номер", null));
        forCells.add(new VariablesForCell("firstName", "Назва", "[A-Za-zА-Яа-яїЇіІєЄ]"));
        forCells.add(new VariablesForCell("birsday", "Модель"));//"[A-Za-zА-Яа-яїЇіІєЄ0-9-]"
        forCells.add(new VariablesForCell("sex", "Специфікації", "[mw]"));
        forCells.add(new VariablesForCell("typeOfSettlement", "Колір", "[A-Za-zА-Яа-яїЇіІєЄ0-9-]"));
        forCells.add(new VariablesForCell("nameOfSettelement", "Ціна", "[0-9.]"));
        forCells.add(new VariablesForCell("addres", "Гарантія", "[0-9"));
        forCells.add(new VariablesForCell("phoneNumber", "Кінець року", "[0-9]"));
        forCells.add(new VariablesForCell("benefits", "К-ість продаж у році", "[A-Za-zА-Яа-яїЇіІєЄ0-9-]"));
        return forCells;
    }

}

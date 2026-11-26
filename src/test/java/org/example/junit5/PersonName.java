package org.example.junit5;

import io.qameta.allure.*;
import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Epic("Names")
@Feature("Проверка базовых сценариев с именами")
@Story("Добавление имен с корректными данными")
@Owner("Адель")
public class PersonName {
    List<String> names = new ArrayList<>();

    @Test
    @DisplayName("Успешное удаление пользователя")
    @Description("Извини, Петя, ты в списке лишний")
    @Severity(SeverityLevel.MINOR)
    public void test(){
        names.add("Valera");
        names.add("Petia");
        names.remove(0);
        Assertions.assertEquals(names.size(),1);
        test4();
    }

    @Test
    @DisplayName("Неуспешное получение списка")
    @Description("чет пошло не так пу-пу-пу")
    @Severity(SeverityLevel.MINOR)
    @Issue("bug-123")
    public void test3(){
        names.add("Sergy");
        names.remove(0);
        Assertions.assertEquals(names.size(), 0);
    }

    @Test
    public void test2() {
        names.add("Valera");
        names.add("Petya");
        names.remove(1);
        Assertions.assertEquals(names.get(0), "Valera");
    }

    @Step("Получение пользователя в БД")
    public void test4() {

    }
}

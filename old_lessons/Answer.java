package old_lessons;

// Дана строка sql-запроса:
// select * from students where "
// Сформируйте часть WHERE этого запроса, 
// используя StringBuilder. Данные (параметры) 
// для фильтрации приведены в виде json-строки в 
// примере ниже. Если значение null, то параметр не должен попадать в запрос.
// Напишите свой код в методе answer класса Answer. 
// Метод answer принимает на вход два параметра:
// String QUERY - начало SQL-запроса 
// String PARAMS - JSON с параметрами
// Пример: Строка sql-запроса:
// select * from students where 
// Параметры для фильтрации:
//  {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Результат:
// select * from students where name='Ivanov' and country='Russia' and city='Moscow'
//
//
//
public class Answer {

    public static StringBuilder answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже

        StringBuilder sb = new StringBuilder(QUERY);
        String name = PARAMS.replace("{", "").
                replace("\"", "").
                replace("}", "").split(",")[0].split(":")[1];
        String country = PARAMS.replace("{", "").
                replace("\"", "").
                replace("}", "").split(",")[1].split(":")[1];
        String city = PARAMS.replace("{", "").
                replace("\"", "").
                replace("}", "").split(",")[2].split(":")[1];
        String age = PARAMS.replace("{", "").
                replace("\"", "").
                replace("}", "").split(",")[3].split(":")[1];
        System.out.println("age" + age);

        // String temp = "=" + "'" + name + "'" + "and" + "'" + country + "'" + "and" + "'" + city + "'" + "and" + "'" + age + "'";
// select * from students where name='Ivanov' and country='Russia' and city='Moscow'
        if (!name.equals("null")) {
            sb.append("name=").
                    append("\'" + name + "\'");
        }
        if (!country.equals("null")) {
            sb.append(" and ").
                    append("country=").
                    append("\'" + country + "\'");
        }
        if (!city.equals("null")) {
            sb.append(" and ").
                    append("city=").
                    append("\'" + city + "\'");
        }
        if (!age.equals("null")) {
            sb.append(" and ").
                    append("age=").
                    append("\'" + age + "\'");
            System.out.println(age);
        }

        // System.out.println(temp);
        return sb;
    }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public static class Printer {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));

        // Answer myans = new Answer();
        // String QUERY = "select * from students where ";
        // String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        // System.out.println(myans.answer(QUERY, PARAMS));
        // System.out.println(Answer.answer(QUERY, PARAMS));
    }
}

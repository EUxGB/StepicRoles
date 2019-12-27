import java.sql.SQLOutput;
import java.util.stream.IntStream;


public class Main {

    public static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder SR = new StringBuilder();

        for (int i = 0; i < textLines.length; i++) {
            SR.append(roles[i]);
            SR.append(":");
            SR.append("\n");

            for (int j = 0; j < textLines.length; j++) {

                if (textLines[j].startsWith(roles[i].concat(":"))) {
                    SR.append(j + 1);
                    SR.append(") ");
                    textLines[j] = textLines[j].substring(textLines[j].indexOf(":") + 1);
                    SR.append(textLines[j]);
                    SR.append("\n");
                    textLines[j] = "0";
                }
            }
            SR.append("\n");
        }
        System.out.println(SR);

        return "";
    }


    public static void main(String[] args) {


        String[] roles = {"Городничий", "Антонович Сквозник-Дмухановский", "Анна Андреевна", "Марья Антоновна", "Лука Лукич Хлопов", "Жена Луки", "Лука", "Аммос Федорович",
                "Ляпкин-Тяпкин", "Артемий Филиппович Земляника", "Иван Кузьмич Шпекин", "Петр Иванович Добчинский", "Петр Иванович Бобчинский", "Иван Александрович Хлестаков",
                "Осип", "Христиан Иванович Гибнер", "Федор Андреевич Люлюков", "Иван Лазаревич Растаковский", "Степан Иванович Коробкин", "Степан Ильич Уховертов", "Свистунов",
                "Пуговицын", "Держиморда", "Абдулин", "Февронья Петровна Пошлепкина", "Жена унтер-офицера", "Мишка", "Слуга трактирный"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем чтобы сообщить вам пренеприятное известие: к нам едет ревизор.", "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.", "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!", "Лука Лукич: Господи Боже! еще и с секретным предписаньем!", "Мишка: У меня есть идея!!!",
                "Свистунов: Иди в жопу Миша!", "Мишка: Не пойду, вот.", "Осип: А как же признание общества!", "Артемий Филиппович: Ну, это еще ничего. Колпаки, пожалуй, можно надеть и чистые.",
                "Городничий: Да, и тоже над каждой кроватью надписать по-латыни или на другом каком языке... это уж по вашей части, Христиан Иванович, — всякую болезнь: когда кто заболел, которого дня и числа... " +
                        "Нехорошо, что у вас больные такой крепкий табак курят, что всегда расчихаешься, когда войдешь. Да и лучше, если б их было меньше: тотчас отнесут к дурному смотрению или к неискусству врача.",
                "Артемий Филиппович: О! насчет врачеванья мы с Христианом Ивановичем взяли свои меры: чем ближе к натуре, тем лучше, — лекарств дорогих мы не употребляем. Человек простой: если умрет, то и так умрет; " +
                        "если выздоровеет, то и так выздоровеет. Да и Христиану Ивановичу затруднительно было б с ними изъясняться: он по-русски ни слова не знает."};


        printTextPerRole(roles, textLines);
        //System.out.println();


    }
}
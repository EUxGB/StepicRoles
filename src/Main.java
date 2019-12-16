public class Main {

    public static String printTextPerRole(String[] roles, String[] textLines) {

        String[] allRoles = roles;
        String[] allText = textLines;
        //String scripti = new String();
        String scriptAll = new String();
        String heroStart = new String();
        String heroNext = new String();
        StringBuilder ri = new StringBuilder();
        final String sp = System.getProperty("line.separator");
            //ri = (allText[0]);
        ri = new StringBuilder(roles[1]);
        //script = ri.substring(3, 9);

        // ri = ri.substring(int 0, int 5);

        //System.out.print(scripti);
        for (int i = 0; i < textLines.length; i++) {
            //scripti = textLines[i];
            if (textLines[i]!="0") heroStart = textLines[i].substring(0,textLines[i].indexOf(":")+1);
            scriptAll = heroStart + sp;
            scriptAll = scriptAll + (i+1)+") "+textLines[i].substring(textLines[i].indexOf(":")+1)+sp;
            textLines[i]="0";

            for (int j=(i+1);j < textLines.length; j++ )
            {
                if (  heroStart. equals   (heroNext = textLines[j].substring(0,textLines[j].indexOf(":")+1)))
                {scriptAll = scriptAll + (j+1)+") "+textLines[j].substring(textLines[j].indexOf(":")+1)+sp;
                    textLines[j]="0";
                }


            }


            System.out.print(scriptAll);
            System.out.println("***************************");



            //ri = allText[i];
            //System.out.print(i+sp);
            //System.out.print(scriptAll);


        }


        return "";
    }


    public static void main(String[] args) {


        String[] roles = {"Антонович Сквозник-Дмухановский", "Анна Андреевна", "Марья Антоновна", "Лука Лукич Хлопов", "Жена Луки", "Лука", "Аммос Федорович", "Ляпкин-Тяпкин", "Артемий Филиппович Земляника", " Иван Кузьмич Шпекин", "Петр Иванович Добчинский", "Петр Иванович Бобчинский", "Иван Александрович Хлестаков", "Осип", "Христиан Иванович Гибнер", "Федор Андреевич Люлюков", "Иван Лазаревич Растаковский", "Степан Иванович Коробкин", "Степан Ильич Уховертов", "Свистунов", "Пуговицын", "Держиморда", "Абдулин", "Февронья Петровна Пошлепкина", "Жена унтер-офицера", "Мишка", "Слуга трактирный"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем чтобы сообщить вам пренеприятное известие: к нам едет ревизор.", "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.", "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!", "Лука Лукич: Господи Боже! еще и с секретным предписаньем!", "Мишка: У меня есть идея!!!", "Свистунов: Иди в жопу Миша!", "Мишка: Не пойду, вот.", "Осип: А как же признание общества!", "Артемий Филиппович: Ну, это еще ничего. Колпаки, пожалуй, можно надеть и чистые.", "Городничий: Да, и тоже над каждой кроватью надписать по-латыни или на другом каком языке... это уж по вашей части, Христиан Иванович, — всякую болезнь: когда кто заболел, которого дня и числа... Нехорошо, что у вас больные такой крепкий табак курят, что всегда расчихаешься, когда войдешь. Да и лучше, если б их было меньше: тотчас отнесут к дурному смотрению или к неискусству врача.", "Артемий Филиппович: О! насчет врачеванья мы с Христианом Ивановичем взяли свои меры: чем ближе к натуре, тем лучше, — лекарств дорогих мы не употребляем. Человек простой: если умрет, то и так умрет; если выздоровеет, то и так выздоровеет. Да и Христиану Ивановичу затруднительно было б с ними изъясняться: он по-русски ни слова не знает."};

        String tpr = new String();

        printTextPerRole(roles, textLines);
        //System.out.println();


    }
}
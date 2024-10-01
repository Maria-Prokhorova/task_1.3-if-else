public class Main {
    public static void main(String[] args) {
        System.out.println();
        /* Задание 6. Повышенная сложность.
        В нашем банке можно, кроме дебетовых, получать еще и кредитные карты. У таких карт есть допустимый лимит
        средств, который рассчитывается исходя из возраста клиента и его зарплаты. Правила расчета следующие:
        Людям старше (или равно) 23 лет мы предоставляем лимит в размере 3 зарплат.
        Людям младше 23 лет мы предоставляем лимит в размере 2 зарплат.
        Если заработная плата клиента выше (или равно) 50 тысяч, мы увеличиваем лимит в 1.2 раза.
        Если заработная плата выше (или равно) 80 тысяч, мы увеличиваем лимит в 1.5 раза.
        Наша задача: написать программу, которая показывает, какую сумму на кредитке может получить клиент.
        Вводные данные:переменная age = 19 для обозначения возраста клиента, salary = 58_000 для обозначения зарплаты клиента.
        Увеличения не могут быть применены одновременно. Необходимо вывести максимальный лимит в консоль в формате:
        «Мы готовы выдать вам кредитную карту с лимитом *** рублей».
         */
        int age = 30;
        int salary = 81_000;
        double limitCreditCard;
        if (age >= 23) {
            limitCreditCard = 3 * salary;
        } else {
            limitCreditCard = 2 * salary;
        }
        if (salary >= 50_000 && salary < 80) {
            limitCreditCard = 1.2 * limitCreditCard;
        } else if (salary >= 80_000) {
            limitCreditCard = 1.5 * limitCreditCard;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limitCreditCard + " рублей");
        System.out.println();

        /* Задание 7. Повышенная сложность.
        Расширим задачу с кредитованием. Прежде чем выдавать кредиты наш банк проводит аудит и оценивает клиентов и их
        возможность выплачивать кредит. Для того, чтобы вывести предварительное решение, нам необходимо использовать
        данные о возрасте, зарплате и желаемой сумме.
        Правила следующие:
        Базовая ставка для клиента — 10% годовых. Срок кредитования — 12 месяцев.
        Максимальный ежемесячный платеж — 50% от ЗП. Если возраст меньше 23, то добавляем 1% к ставке. Если возраст
        меньше 30, то добавляем 0.5% к ставке. Если зарплата больше 80_000, уменьшаем ставку на 0.7%.
        Нам нужно написать программу для предварительного одобрения/отказа заявки по кредиту.
        Вводные данные: используйте переменные age = 25 для обозначения возраста,salary = 60_000 для обозначения
        зарплаты, wantedSum = 330_000 для обозначения желаемой суммы кредита.
        Подсчитайте и выведите ответ, одобрен кредит или нет. На основании зарплаты подсчитайте максимальный допустимый
        платеж. Если максимальный допустимый платеж по ЗП больше стандартного платежа по кредиту согласно процентной
        ставке, то кредит одобрен, если меньше — отказан.
        Пример ответа в консоль: «Максимальный платеж при ЗП *** равен *** рублей. Платеж по кредиту *** рублей.
        Одобрено/отказано».
         */
        age = 23;
        salary = 60_000;
        int wantedSum = 330_000;
        double rate = 10.0;
        double monthPayment;
        int maxPayment = salary / 2;
        if (age < 23) {
            rate = rate + 1;
        } else if (age >= 23 && age < 30) {
            rate = rate + 0.5;
        }
        if (salary > 80_000) {
            rate = rate - 0.7;
        }
        monthPayment = (wantedSum * (1 + rate / 100)) / 12;
        System.out.println(rate);
        if (maxPayment > monthPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. " +
                    "Платеж по кредиту " + monthPayment + " рублей. Кредит одобрен.");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. " +
                    "Платеж по кредиту " + monthPayment + " рублей. В кредите отказано.");
        }


    }
}
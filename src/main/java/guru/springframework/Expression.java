package guru.springframework;

interface Expression {
    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);
}

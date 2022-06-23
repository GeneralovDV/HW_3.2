public class Main {
//    i - индекс массы тела человка.
//    m - масса тела в килограммах.
//    h - рост в метрах.
/*
Индекс массы тела рассчитывается по формуле:
i = m / (h * h)

Например, масса человека = 77 кг, рост = 170 см. Следовательно, индекс массы тела в этом случае равен:
ИМТ = 77 : (1,70 × 1,70) ≈ 26,64 кг/м²
 */
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 98.5;
        double h = 1.87;
        double i = service.bmi(m, h);
        System.out.println(i);

    }
}

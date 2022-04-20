package arseniyusik.lessonOOP.tasksEnum.Clothes;

public class ApplicationClothes {
    public static void main(String[] args) {
        Clothes []clothes = new Clothes[4];
        clothes[0] = new Dress(SizeClothes.XS,60,"Черный");
        clothes[1] = new TShirt(SizeClothes.M,30.5,"Белый");
        clothes[2] = new Tie(SizeClothes.L,20.5,"Красный");
        clothes[3] = new Trousers(SizeClothes.XXS,90,"Коричневый");

        Studio studio = new Studio();
        studio.putOnMan(clothes);
        studio.putOnWoman(clothes);
    }
}

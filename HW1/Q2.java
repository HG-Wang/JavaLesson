public class Q2 {
    public static void main(String[] args) {
        // 检查是否提供了输入参数
        if (args.length == 0) {
            System.out.println("请提供一个奇数作为层数，范围在5到11之间。");
            return;
        }

        // 将输入参数转换为整数
        int levels;
        try {
            levels = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("请输入有效的整数。");
            return;
        }

        // 检查提供的数字是否是奇数且在指定范围内
        if (levels < 5 || levels > 11 || levels % 2 == 0) {
            System.out.println("请输入一个奇数作为层数，范围在5到11之间。");
            return;
        }
        System.out.println(levels);
        // 输出星塔
        printStarTower(levels);
    }

    private static void printStarTower(int levels) {
        // 打印上半部分星塔
        for (int i = 0; i <= levels / 2; i++) {
            // 计算空格和星号的数量
            int spaces = (levels - (2 * i + 1)) / 2;
            int stars = 2 * i + 1;

            // 打印当前行的空格
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // 打印当前行的星号
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            // 换行
            System.out.println();
        }

        // 打印下半部分星塔
        for (int i = levels / 2 - 1; i >= 0; i--) {
            // 计算空格和星号的数量
            int spaces = (levels - (2 * i + 1)) / 2;
            int stars = 2 * i + 1;

            // 打印当前行的空格
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // 打印当前行的星号
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            // 换行
            System.out.println();
        }
    }
}

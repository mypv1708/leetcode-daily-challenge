package Other;

public class PrecessingName {
    public static String formatTitle(String title) {
        // Bước 1: Thay dấu chấm sau số đầu bài thành dấu gạch dưới
        title = title.replaceFirst("\\.", "");

        // Bước 2: Thay khoảng trắng bằng dấu gạch dưới
        title = title.replaceAll(" ", "_");

        return title;
    }

    public static void main(String[] args) {
        String title = "4. Median of Two Sorted Arrays";
        String formattedTitle = formatTitle(title);
        System.out.println("_" + formattedTitle);
    }
}

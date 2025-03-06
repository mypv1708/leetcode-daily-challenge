package Other;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.Arrays;
import java.util.List;

public class Spark {
    public static void main(String[] args) {
        // Cấu hình Other.Spark
        SparkConf conf = new SparkConf().setAppName("JavaSparkExample").setMaster("local[*]");
        JavaSparkContext sc = new JavaSparkContext(conf);

        // Tạo danh sách số và biến thành RDD
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        JavaRDD<Integer> rdd = sc.parallelize(numbers);

        // Tính tổng của các số
        int sum = rdd.reduce(Integer::sum);

        // In kết quả ra màn hình
        System.out.println("Tổng của dãy số là: " + sum);

        // Dừng SparkContext
        sc.close();
    }
}

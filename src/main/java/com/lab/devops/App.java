package com.lab.devops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lớp tiện ích App cung cấp các chức năng cơ bản của ứng dụng.
 * Theo quy tắc Sun Checks, lớp tiện ích phải được đánh dấu final và
 * có hàm khởi tạo private để ngăn việc khởi tạo đối tượng.
 */
public final class App {

    /** Định nghĩa hằng số cho số thứ nhất để tránh lỗi Magic Number. */
    private static final int FIRST_NUMBER = 5;

    /** Định nghĩa hằng số cho số thứ hai để tránh lỗi Magic Number. */
    private static final int SECOND_NUMBER = 10;

    /**
     * Logger cho lớp App.
     * Tên hằng số phải viết hoa toàn bộ (LOGGER) theo quy tắc Sun.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    /**
     * Hàm khởi tạo private để ngăn việc tạo đối tượng từ lớp tiện ích này.
     */
    private App() {
        // Empty constructor for utility class
    }

    /**
     * Điểm bắt đầu của chương trình.
     * Tham số phải được đánh dấu là final.
     *
     * @param args tham số dòng lệnh
     */
    public static void main(final String[] args) {
        LOGGER.info("Starting Application...");
        int result = add(FIRST_NUMBER, SECOND_NUMBER);
        LOGGER.info("Result is: {}", result);
    }

    /**
     * Thực hiện phép cộng hai số nguyên.
     * Tham số phải được đánh dấu là final.
     *
     * @param a số hạng thứ nhất
     * @param b số hạng thứ hai
     * @return tổng của a và b
     */
    public static int add(final int a, final int b) {
        return a + b;
    }
}

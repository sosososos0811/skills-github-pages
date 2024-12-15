import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class URLChristmasLove {
    public static void main(String[] args) {
        try {
            // URL 객체 생성
            URL myURL = new URL("http://www.ChristmasLoveGame.com");

            // URL에서 데이터를 읽기 위해 연결을 시도
            BufferedReader in = new BufferedReader(new InputStreamReader(myURL.openStream()));
            String inputLine;

            // URL의 내용을 출력 (웹페이지의 HTML 소스)
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("URL을 연결하는 데 문제가 발생했습니다: " + e.getMessage());
        }
    }
}
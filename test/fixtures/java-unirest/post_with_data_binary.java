import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

class Main {
    public static void main(String[] args) {
            HttpResponse<String> httpResponse
               = Unirest.post("http://localhost:28139/post")
            .header("Content-Type", "application/x-www-form-urlencoded")
            .body("{\"title\":\"china1\"}")
            .asString();
    }
}
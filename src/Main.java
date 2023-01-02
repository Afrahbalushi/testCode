import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {


        // to read a random APIs
      /*  HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://catfact.ninja/fact"))
                .GET()
                .build();

        HttpResponse<String> response = null;

        try{
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        }catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String jsonString = response.body();
        Map<String, Object> retMap = new Gson().fromJson(

                jsonString, new TypeToken<HashMap<String, Object>>() {}.getType()
        );
        System.out.println(retMap.get("fact").toString());

*/


//saving image from google to a folder .. (https://stackoverflow.com/questions/5882005/how-to-download-image-from-any-web-page-in-java)
       InputStream in ;
        try {
            in = new URL("https://th.bing.com/th/id/R.4f3b37b37b55aed0c11c64cc915cf0b7?rik=jkCsmuSEw1YE2Q&riu=http%3a%2f%2fzeptosystems.com%2fwp-content%2fuploads%2f2018%2f10%2fjava-1.jpg&ehk=HovaxzZAqHPCIjSELmwew9GO%2b5dvz2XtBgAezfMtUzA%3d&risl=&pid=ImgRaw&r=0").openStream();
            Files.copy(in, Paths.get("C:\\Users\\AfrahAlBalushi\\image.jpg"));
        } finally {

        }




    }
}
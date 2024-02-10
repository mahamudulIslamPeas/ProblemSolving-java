package jwtDecoder;

import java.util.Arrays;
import java.util.Base64;

public class JwtDecoder {
    public static void main(String[] args) {
        tokenDecoder("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnRfaWQiOiIwNTEzRDdCNC01Q0QxLTQwRjctQUM0Qy05QjhERjBEOUJDRkYiLCJzdWIiOiJkMzU3NzY5Mi04Y2E0LTQzNTgtOTFhMi0xNmQwMGNkZDY0YjMiLCJzaXRlX2lkIjoiQTNBODI3NjYtMEM4OC00NzZCLTgzMDAtMUIxNUY2NzJGMjNCIiwib3JpZ2luIjoibXlza28uc2VsaXNlbG9jYWwuY29tIiwic2Vzc2lvbl9pZCI6ImVjYXAtOWM1NzBmZmUtZjU2Ni00ZjgwLWFmYTAtNDIxYzNjYWY1ZDg5IiwidXNlcl9pZCI6ImQzNTc3NjkyLThjYTQtNDM1OC05MWEyLTE2ZDAwY2RkNjRiMyIsImRpc3BsYXlfbmFtZSI6IlBlYXMgc3VwZXJBZG1pbiIsInNpdGVfbmFtZSI6IkxFQURFUlMgT0YgU0tPIiwidXNlcl9uYW1lIjoicGVhc19zdXBlcmFkQHlvcG1haWwuY29tIiwiZW1haWwiOiJwZWFzX3N1cGVyYWRAeW9wbWFpbC5jb20iLCJwaG9uZV9udW1iZXIiOiIrNDE0NDQ0NDQ0NDQiLCJsYW5ndWFnZSI6ImVuIiwidXNlcl9sb2dnZWRpbiI6IlRydWUiLCJuYW1lIjoiZDM1Nzc2OTItOGNhNC00MzU4LTkxYTItMTZkMDBjZGQ2NGIzIiwidXNlcl9hdXRvX2V4cGlyZSI6IkZhbHNlIiwidXNlcl9leHBpcmVfb24iOiIwMS8wMS8wMDAxIDAwOjAwOjAwIiwicm9sZSI6WyJ3ZWJtYXN0ZXIiLCJhY3RpdmUiLCJjYXJlZXJfY29hY2giLCJtZW50b3IiLCJzcGVha2VyIiwiYXBwdXNlciIsImFub255bW91cyIsIndlYi1hcHBsaWNhdGlvbi11c2VyIl0sIm5iZiI6MTY5ODIxMzIyNCwiZXhwIjoxNjk4MjEzNjQ0LCJpc3MiOiJDTj1FbnRlcnByaXNlIENsb3VkIEFwcGxpY2F0aW9uIFBsYXRmb3JtIiwiYXVkIjoiKiJ9.KSvgEo-IwJWWnIVdyoMsOhgwcXu1BjUMNABXOw2XwnahEBGBeDXaRMdLm-NJfFP6iTRlom6eUClR7YYENMIf7645NvLJer14HFzTpS_EdVZ9Ppaub4GqGW1f3prnodKjDOP0lEC0JllyCWYAbd0yeLQF97z40vswvH3RgnF8OagSEsPOP3oTADPIBvnhHk6drUa4Bv-3_IgR4H1r-SaojdSLryAe8beaojDqL86t14DGgz5Tw3F_f0Q-ozPv20XBi65slpM4zPvWIh5zUthInFw8V6977a9Ju4rl2JLvONmwo7rbRnRRZSrQCjZkr5ZLC1X7B7KvjopN21f92DLuGA");
    }
    private static void tokenDecoder(String insertToken){
        Base64.Decoder decoder = Base64.getUrlDecoder();
        String[] chunks = insertToken.split("\\.");
        String header = new String(decoder.decode(chunks[0]));
        String payload = new String(decoder.decode(chunks[1]));
        System.out.println("Header: " + header);
        System.out.println("Payload: " + Arrays.toString(payload.split(",")));
    }
}

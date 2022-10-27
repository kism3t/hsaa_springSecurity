@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/public/v1")
public class AuthenticationController {

    @GetMapping(path = "/basicauth")
    public ResponseEntity<User> login(Authentication authentication) {

        return new ResponseEntity<>(
                User
                .builder()
                        .name(authentication.getName())
                        .role(authentication.getAuthorities().toString())
                .build(),
                HttpStatus.OK);
    }
}

package GestionLivres;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/livres")
@CrossOrigin


public class LivreController {
    private final LivreRepository repository;

    public LivreController(LivreRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Livre> lister() {
        return repository.findAll();
    }

    @PostMapping
    public Livre ajouter(@RequestBody Livre livre) {
        return repository.save(livre);
    }




}

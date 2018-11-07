/**
 *
 */
package io.github.mpv1989.arangodb.spring.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.mpv1989.arangodb.spring.demo.domain.Entity;
import io.github.mpv1989.arangodb.spring.demo.service.EntityService;
import lombok.RequiredArgsConstructor;

/**
 * @author Mark Vollmary
 *
 */
@RestController
@RequestMapping("/entity")
@RequiredArgsConstructor
class EntityController {

	private final EntityService service;

	@PostMapping
	public Entity save(@RequestBody final Entity entity) {
		return service.save(entity);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Entity> get(@PathVariable final String id) {
		return service.get(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable final String id) {
		service.delete(id);
	}

}

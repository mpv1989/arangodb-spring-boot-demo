/**
 *
 */
package io.github.mpv1989.arangodb.spring.demo.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import io.github.mpv1989.arangodb.spring.demo.domain.Entity;
import io.github.mpv1989.arangodb.spring.demo.repository.EntityRepository;
import io.github.mpv1989.arangodb.spring.demo.service.EntityService;
import lombok.RequiredArgsConstructor;

/**
 * @author Mark Vollmary
 *
 */
@Service
@RequiredArgsConstructor
class EntityServiceImpl implements EntityService {

	private final EntityRepository repository;

	@Override
	public Entity save(final Entity entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Entity> get(final String id) {
		return repository.findById(id);
	}

	@Override
	public void delete(final String id) {
		repository.deleteById(id);
	}

	@Override
	public Iterable<Entity> getAll() {
		return repository.findAll();
	}

	@Override
	public Iterable<Entity> byName(final String name) {
		return repository.findByName(name);
	}

}

package vn.iotstar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import vn.iotstar.entity.Category;

public interface CategoryService {

	<S extends Category> S save(S entity);

	Optional<Category> findById(Long id);

	List<Category> findAll(Sort sort);

	Page<Category> findAll(Pageable pageable);

	List<Category> findAll();

	void deleteById(Long id);

	long count();
	public Page<Category> findByNameContaining(String keyword, Pageable page) ;
	
	
}

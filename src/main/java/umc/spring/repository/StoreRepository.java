package umc.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.domain.Member;
import umc.spring.domain.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {
}

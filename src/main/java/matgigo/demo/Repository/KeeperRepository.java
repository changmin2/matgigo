package matgigo.demo.Repository;

import matgigo.demo.Domain.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeeperRepository extends JpaRepository<Test,Long> {
}

package umc.spring.service.memberservice;

import org.springframework.stereotype.Service;
import umc.spring.domain.Member;

import java.util.Optional;


public interface MemberQueryService {
    Optional<Member> findMember(Long id);
}

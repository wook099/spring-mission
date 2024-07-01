package umc.spring.service.storeservice;

import umc.spring.domain.Mission;
import umc.spring.domain.Review;
import umc.spring.domain.Store;
import umc.spring.web.dto.StoreRequestDTO;

public interface StoreCommandService {
    Review createReview(Long memberId, Long storeId, StoreRequestDTO.ReveiwDTO request);
    Store createStore(StoreRequestDTO.CreateStoreDTO request);
    Mission createMission(Long storeId, StoreRequestDTO.CreateMissionDTO request);
    void addMissionToChallenge(Long storeId, Long missionId, Long challengeId);
}

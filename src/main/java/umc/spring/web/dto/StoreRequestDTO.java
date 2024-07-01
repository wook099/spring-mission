package umc.spring.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.LocalDate;

public class StoreRequestDTO {

    @Getter
    public static class ReveiwDTO{
        @NotBlank
        String title;
        @NotNull
        Float score;
        @NotBlank
        String body;
    }

    @Getter
    public static class CreateStoreDTO {
        @NotNull
        Long id;
        @NotBlank
        String name;
        @NotBlank
        String address;
    }

    @Getter
    public static class CreateMissionDTO {

        @NotNull
        Long id;
        @NotNull
        LocalDate deadline;
        @NotBlank
        String missionSpec;
        @NotNull
        Integer reward;

    }

    @Getter
    public static class AddMissionToChallengeDTO {
        @NotNull
        Long missionId;
        @NotNull
        Long challengeId;
    }
}
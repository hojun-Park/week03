package com.example.inhastudy1.inhastudy1.service;

import com.example.inhastudy1.inhastudy1.domain.SignUp;
import com.example.inhastudy1.inhastudy1.domain.SignUpRepository;
import com.example.inhastudy1.inhastudy1.models.SignUpRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class SignUpService {
    private SignUpRepository signupRepository;

    @Transactional
    public String update(String id, SignUpRequestDto signupRequestDto) {
        SignUp signup = signupRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("정보 수정에 실패하였습니다.")
        );
        signup.update(signupRequestDto);
        return signup.getId();
    }

    @Transactional
    public void updateCheckLogin(SignUp signUp, String checkLogin) {
        signUp.updateCheckLogin(checkLogin);
    }
}

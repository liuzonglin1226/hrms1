package com.test.biz;

import com.test.model.Invitation;

import java.util.List;

public interface InvitationService {
    List<Invitation> selectByTouristId(int id);
    void saveInvitation(Invitation invitation);
    void deleteInvitationById(int id);
    void updateState(Invitation invitation);
}

package org.mohcc.zw.vmmc.service;

import org.mohcc.zw.vmmc.model.RemarksComments;

import java.util.List;

public interface RemarksCommentsService {
    RemarksComments saveRemarksComments(RemarksComments remarksComments);
    RemarksComments getRemarksCommentsById(String id);
    List<RemarksComments> getAllRemarksComments();
}

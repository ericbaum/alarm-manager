package com.cpqd.vppd.alarmmanager.core.services.impl;

import com.cpqd.vppd.alarmmanager.core.exception.AlarmNotPresentException;
import com.cpqd.vppd.alarmmanager.core.model.Alarm;
import com.cpqd.vppd.alarmmanager.core.repository.AlarmRepository;
import com.cpqd.vppd.alarmmanager.core.services.AlarmServices;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.Date;
import java.util.Map;

/**
 * Implementation for alarm business services.
 */
@Stateless
public class AlarmServicesImpl implements AlarmServices {

    @Inject
    private AlarmRepository alarmRepository;

    @Override
    public void add(Alarm alarm) {
        alarmRepository.add(alarm);
    }

    @Override
    public void update(Alarm alarm) {
//        alarmRepository.update(alarm);
    }

    @Override
    public void clear(Map<String, Object> primarySubject, Date reportedDisappearanceTimestamp) throws AlarmNotPresentException {

    }

    @Override
    public Alarm findByPrimarySubject(Map<String, Object> primarySubject) {
        return alarmRepository.findByPrimarySubject(primarySubject);
    }
}

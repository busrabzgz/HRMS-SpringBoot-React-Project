package com.example.humanresources.mapper;

import com.example.humanresources.dto.requestDTO.CreateLeaveRequestDto;
import com.example.humanresources.dto.requestDTO.CreateOvertimeWorkRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateLeaveRequestDto;
import com.example.humanresources.dto.requestDTO.UpdateOvertimeWorkRequestDto;
import com.example.humanresources.dto.responseDTO.LeaveResponseDto;
import com.example.humanresources.dto.responseDTO.OvertimeWorkResponseDto;
import com.example.humanresources.entity.Leave;
import com.example.humanresources.entity.OvertimeWork;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface LeaveMapper {
    @Mapping(source = "userId", target = "user.id", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT)
    Leave toLeaveFromCreateLeaveRequestDto(CreateLeaveRequestDto leaveRequestDto);



    Leave toLeaveFromUpdateLeaveRequestDto(UpdateLeaveRequestDto leaveRequestDto);
    @Mapping(source = "user.id", target = "userId")
    LeaveResponseDto toLeaveResponseDtoFromLeave(Leave leave);
}

package com.example.bankapplication.mapping;

import com.example.bankapplication.model.Account;
import com.example.bankapplication.request.AccountRequest;
import com.example.bankapplication.response.AccountResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface AccountMapping {
    Account requestToEntity(AccountRequest accountRequest);

    AccountResponse createToResponse(Account Account);

    AccountResponse readToResponse(Account Account);

    AccountResponse updateToResponse(Account Account);

    Account updateAccountToUpdateResponse(AccountRequest AccountRequest, @MappingTarget Account Account);
}

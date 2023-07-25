package sparta.kingdombe.domain.job.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sparta.kingdombe.domain.job.dto.JobResponseDto;
import sparta.kingdombe.domain.job.dto.JobSearchCondition;
import sparta.kingdombe.domain.job.entity.JobInfo;

public interface JobRepositoryCustom {

    Page<JobInfo> searchJob(JobSearchCondition condition, Pageable pageable);
}

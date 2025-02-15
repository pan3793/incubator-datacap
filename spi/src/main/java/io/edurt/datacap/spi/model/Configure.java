package io.edurt.datacap.spi.model;

import io.edurt.datacap.spi.FormatType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;
import java.util.Optional;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Configure
{
    private String host;
    private Integer port;
    private Optional<String> username = Optional.empty();
    private Optional<String> password = Optional.empty();
    private Optional<String> database = Optional.empty();
    private Optional<Map<String, Object>> env = Optional.empty();
    private FormatType format = FormatType.NONE;
}

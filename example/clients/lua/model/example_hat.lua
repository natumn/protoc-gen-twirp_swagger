--[[ 
  service.proto
 
  No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 
  OpenAPI spec version: version not set
  
  Generated by: https://github.com/swagger-api/swagger-codegen.git
]]

-- example_hat class
local example_hat = {}
local example_hat_mt = {
	__name = "example_hat";
	__index = example_hat;
}

local function cast_example_hat(t)
	return setmetatable(t, example_hat_mt)
end

local function new_example_hat(size, color, name)
	return cast_example_hat({
		["size"] = size;
		["color"] = color;
		["name"] = name;
	})
end

return {
	cast = cast_example_hat;
	new = new_example_hat;
}

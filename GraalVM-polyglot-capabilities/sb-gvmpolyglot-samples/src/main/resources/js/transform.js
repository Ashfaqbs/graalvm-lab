function transformJSON(json) {
    if (typeof json === 'object' && json !== null) {
        if (Array.isArray(json)) {
            return json.map(transformJSON);
        } else {
            return Object.fromEntries(
                Object.entries(json).map(([key, value]) => [key, transformJSON(value)])
            );
        }
    } else if (typeof json === 'string') {
        return json.toUpperCase();
    }
    return json;
}

// Assuming JSON input comes from command line or another source
var input = JSON.parse(process.argv[2]);
console.log(JSON.stringify(transformJSON(input)));